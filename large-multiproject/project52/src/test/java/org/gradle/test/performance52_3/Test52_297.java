package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_297 {
    private final Production52_297 production = new Production52_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}