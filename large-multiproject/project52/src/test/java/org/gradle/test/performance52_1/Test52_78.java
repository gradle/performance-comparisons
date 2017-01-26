package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_78 {
    private final Production52_78 production = new Production52_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}