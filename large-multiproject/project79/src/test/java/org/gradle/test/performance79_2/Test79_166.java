package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_166 {
    private final Production79_166 production = new Production79_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}