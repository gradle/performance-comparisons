package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_303 {
    private final Production33_303 production = new Production33_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}