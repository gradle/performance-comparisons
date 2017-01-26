package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_58 {
    private final Production52_58 production = new Production52_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}