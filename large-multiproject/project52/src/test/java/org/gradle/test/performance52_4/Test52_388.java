package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_388 {
    private final Production52_388 production = new Production52_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}