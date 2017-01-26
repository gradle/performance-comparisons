package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_353 {
    private final Production52_353 production = new Production52_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}