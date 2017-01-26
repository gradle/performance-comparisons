package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_106 {
    private final Production23_106 production = new Production23_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}