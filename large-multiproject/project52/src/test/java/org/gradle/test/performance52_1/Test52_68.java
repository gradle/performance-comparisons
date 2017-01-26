package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_68 {
    private final Production52_68 production = new Production52_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}