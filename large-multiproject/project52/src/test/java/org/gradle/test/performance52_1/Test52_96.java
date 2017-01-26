package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_96 {
    private final Production52_96 production = new Production52_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}