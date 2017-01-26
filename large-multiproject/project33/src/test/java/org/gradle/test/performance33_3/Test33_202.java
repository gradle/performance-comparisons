package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_202 {
    private final Production33_202 production = new Production33_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}