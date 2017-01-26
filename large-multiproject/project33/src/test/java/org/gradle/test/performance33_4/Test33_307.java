package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_307 {
    private final Production33_307 production = new Production33_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}