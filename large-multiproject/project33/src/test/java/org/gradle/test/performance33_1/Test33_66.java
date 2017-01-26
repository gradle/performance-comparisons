package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_66 {
    private final Production33_66 production = new Production33_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}