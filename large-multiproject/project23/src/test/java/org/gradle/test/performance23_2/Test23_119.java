package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_119 {
    private final Production23_119 production = new Production23_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}