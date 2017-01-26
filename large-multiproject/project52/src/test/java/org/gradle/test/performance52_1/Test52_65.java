package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_65 {
    private final Production52_65 production = new Production52_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}