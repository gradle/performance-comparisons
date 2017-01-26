package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_330 {
    private final Production33_330 production = new Production33_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}