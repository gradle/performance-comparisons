package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_297 {
    private final Production33_297 production = new Production33_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}