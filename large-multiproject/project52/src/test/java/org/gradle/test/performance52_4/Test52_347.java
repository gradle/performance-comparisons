package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_347 {
    private final Production52_347 production = new Production52_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}