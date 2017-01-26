package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_183 {
    private final Production33_183 production = new Production33_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}