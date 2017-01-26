package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_281 {
    private final Production23_281 production = new Production23_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}