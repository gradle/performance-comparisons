package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_227 {
    private final Production51_227 production = new Production51_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}