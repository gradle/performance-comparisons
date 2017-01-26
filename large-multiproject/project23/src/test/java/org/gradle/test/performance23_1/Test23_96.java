package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_96 {
    private final Production23_96 production = new Production23_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}