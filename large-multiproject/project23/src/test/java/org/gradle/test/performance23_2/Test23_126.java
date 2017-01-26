package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_126 {
    private final Production23_126 production = new Production23_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}