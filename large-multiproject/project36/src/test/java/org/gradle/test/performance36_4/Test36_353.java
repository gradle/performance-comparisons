package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_353 {
    private final Production36_353 production = new Production36_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}