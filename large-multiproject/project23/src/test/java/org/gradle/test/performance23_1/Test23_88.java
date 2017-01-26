package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_88 {
    private final Production23_88 production = new Production23_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}