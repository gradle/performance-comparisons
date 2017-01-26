package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_39 {
    private final Production52_39 production = new Production52_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}