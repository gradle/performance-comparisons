package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_168 {
    private final Production23_168 production = new Production23_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}