package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_269 {
    private final Production78_269 production = new Production78_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}