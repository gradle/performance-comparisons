package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_137 {
    private final Production52_137 production = new Production52_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}