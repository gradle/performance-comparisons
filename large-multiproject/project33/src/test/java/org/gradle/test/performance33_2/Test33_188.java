package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_188 {
    private final Production33_188 production = new Production33_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}