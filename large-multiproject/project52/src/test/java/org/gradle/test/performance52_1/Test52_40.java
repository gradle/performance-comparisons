package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_40 {
    private final Production52_40 production = new Production52_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}