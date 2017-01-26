package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_166 {
    private final Production11_166 production = new Production11_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}