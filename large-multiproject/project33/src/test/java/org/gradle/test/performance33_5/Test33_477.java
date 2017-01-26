package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_477 {
    private final Production33_477 production = new Production33_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}