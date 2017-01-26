package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_44 {
    private final Production33_44 production = new Production33_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}