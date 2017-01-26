package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_458 {
    private final Production23_458 production = new Production23_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}