package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_98 {
    private final Production23_98 production = new Production23_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}