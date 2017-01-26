package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_297 {
    private final Production23_297 production = new Production23_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}