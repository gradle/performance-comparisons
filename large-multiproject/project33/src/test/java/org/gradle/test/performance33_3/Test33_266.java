package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_266 {
    private final Production33_266 production = new Production33_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}