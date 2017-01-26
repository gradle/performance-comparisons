package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_90 {
    private final Production11_90 production = new Production11_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}