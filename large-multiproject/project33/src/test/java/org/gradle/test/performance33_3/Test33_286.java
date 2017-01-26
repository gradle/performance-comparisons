package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_286 {
    private final Production33_286 production = new Production33_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}