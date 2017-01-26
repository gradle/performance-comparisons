package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_305 {
    private final Production33_305 production = new Production33_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}