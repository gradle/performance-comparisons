package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_228 {
    private final Production33_228 production = new Production33_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}