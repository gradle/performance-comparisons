package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_228 {
    private final Production52_228 production = new Production52_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}