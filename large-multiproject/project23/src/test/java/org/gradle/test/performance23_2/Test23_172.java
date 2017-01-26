package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_172 {
    private final Production23_172 production = new Production23_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}