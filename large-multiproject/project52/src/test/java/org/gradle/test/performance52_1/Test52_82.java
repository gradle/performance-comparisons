package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_82 {
    private final Production52_82 production = new Production52_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}