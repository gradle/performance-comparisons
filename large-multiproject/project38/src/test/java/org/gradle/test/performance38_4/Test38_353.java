package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_353 {
    private final Production38_353 production = new Production38_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}