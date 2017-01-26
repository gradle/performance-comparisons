package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_126 {
    private final Production52_126 production = new Production52_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}