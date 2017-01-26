package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_134 {
    private final Production52_134 production = new Production52_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}