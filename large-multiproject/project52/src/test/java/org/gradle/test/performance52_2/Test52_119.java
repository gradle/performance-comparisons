package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_119 {
    private final Production52_119 production = new Production52_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}