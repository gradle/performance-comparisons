package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_88 {
    private final Production52_88 production = new Production52_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}