package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_166 {
    private final Production33_166 production = new Production33_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}