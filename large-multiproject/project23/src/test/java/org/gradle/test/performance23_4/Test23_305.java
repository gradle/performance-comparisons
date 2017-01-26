package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_305 {
    private final Production23_305 production = new Production23_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}