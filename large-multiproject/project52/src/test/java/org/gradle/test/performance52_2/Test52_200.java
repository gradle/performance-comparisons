package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_200 {
    private final Production52_200 production = new Production52_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}