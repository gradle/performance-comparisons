package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_203 {
    private final Production33_203 production = new Production33_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}