package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_41 {
    private final Production78_41 production = new Production78_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}