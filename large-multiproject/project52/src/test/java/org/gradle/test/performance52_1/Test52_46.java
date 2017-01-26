package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_46 {
    private final Production52_46 production = new Production52_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}