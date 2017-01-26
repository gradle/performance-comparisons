package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_93 {
    private final Production33_93 production = new Production33_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}