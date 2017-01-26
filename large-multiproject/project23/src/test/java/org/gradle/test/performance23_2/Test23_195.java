package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_195 {
    private final Production23_195 production = new Production23_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}