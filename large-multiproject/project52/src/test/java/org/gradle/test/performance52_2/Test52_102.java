package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_102 {
    private final Production52_102 production = new Production52_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}